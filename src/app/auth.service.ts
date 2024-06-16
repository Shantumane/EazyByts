import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  
  getUserName(): string {
    const currentUser = JSON.parse(localStorage.getItem('currentUser') || '{}');
    return currentUser.username || '';
  }
  
  baseUrl!: 'http://localhost:999/api/login';

  constructor(private http: HttpClient) { }

  login(userData: any): Observable<any> {
    return this.http.post<any>('http://localhost:999/api/login', userData);
  }

  register(userData: any): Observable<any> {
    return this.http.post<any>('http://localhost:999/api/register', userData);
  }

  getStudentDetails(): Observable<any> {
    return this.http.get<any>(`${this.baseUrl}/student/details`);
  }

}
