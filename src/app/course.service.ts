import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Course } from './Course.module';

@Injectable({
  providedIn: 'root'
})
export class CourseService {

  private apiUrl = 'http://localhost:999/api/courses'; // Replace with your actual API URL

  constructor(private http: HttpClient) { }

  getCourses(): Observable<any> {
    return this.http.get<any>(this.apiUrl);
  }
}
