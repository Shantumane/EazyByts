import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { UserService } from '../user.service';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrl: './profile.component.css'
})
export class ProfileComponent implements OnInit {
  user: any;

  constructor(private userService: UserService) {}

  ngOnInit(): void {
    const userId = 1; // Replace with dynamic user ID if needed
    this.userService.getUserData(userId).subscribe({
      next: (data) => {
        this.user = data;
      },
      error: (error) => {
        console.error('There was an error!', error);
      }
    });
  }
}