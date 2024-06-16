import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { ProfileComponent } from './profile/profile.component';
import { HomeComponent } from './home/home.component';
import { CoursesComponent } from './courses/courses.component';

const routes: Routes = [
  { path: '', redirectTo: '/login', pathMatch: 'full' },
  { path: 'login', component: LoginComponent },
  { path: 'login/register', component: RegisterComponent },
  { path: 'profile', component: ProfileComponent},
  {path : 'profile/home',component: HomeComponent},
  {path : 'profile/user',component:ProfileComponent},
  { path: 'courses', component: CoursesComponent },
  {path : '**', component:HomeComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
