import { Component } from '@angular/core';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrl: './register.component.css'
})
export class RegisterComponent {
  registerData = {
    userName: '',
    email: '',
    password: '',
    userType: ''
  };

  constructor(private authService: AuthService, private router: Router) { }

  ngOnInit(): void {
  }

  register(): void {
    this.authService.register(this.registerData).subscribe({
      next: (response) => {
        console.log(response); // Handle response accordingly
        alert('Registration successful. Please log in.');
        this.router.navigate(['/login']);
      },
      error: (error) => {
        alert('Registration failed: ' + error.error.message);
      }
    });
  }
}
