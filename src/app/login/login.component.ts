import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
  userName: string = '';
  password: string = '';

  constructor(private http: HttpClient, private router: Router) {}

  login(): void {
    const loginRequest = { userName: this.userName, password: this.password };
    
    this.http.post<any>('http://localhost:999/api/login', loginRequest).subscribe({
      next: (response) => {
        alert(response.message); // Shows the login successful message
        this.router.navigate(['/profile']);
      },
      error: (error) => {
        alert(error.error.message); // Shows the error message
      }
    });
  }
}

