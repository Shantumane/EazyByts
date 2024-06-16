import { Component } from '@angular/core';
import { CourseService } from '../course.service';
import { DomSanitizer, SafeResourceUrl } from '@angular/platform-browser';

@Component({
  selector: 'app-courses',
  templateUrl: './courses.component.html',
  styleUrl: './courses.component.css'
})
export class CoursesComponent {
  courses = [
    {
      title: 'Introduction to Angular',
      description: 'Learn the basics of Angular framework with hands-on examples.',
      imageUrl: 'https://upload.wikimedia.org/wikipedia/commons/c/cf/Angular_full_color_logo.svg',
      videoUrl: 'https://www.youtube.com/watch?v=0LhBvp8qpro&t=3296s'
    },
    {
      title: 'JavaScript Fundamentals',
      description: 'Master the fundamentals of JavaScript programming language.',
      imageUrl: 'https://upload.wikimedia.org/wikipedia/commons/b/ba/Javascript_badge.svg',
      videoUrl: 'https://www.youtube.com/watch?v=VlPiVmYuoqw'
    },
    {
      title: 'Java',
      description: 'Master in java programming language.',
      imageUrl: 'https://upload.wikimedia.org/wikipedia/en/thumb/3/30/Java_programming_language_logo.svg/300px-Java_programming_language_logo.svg.png',
      videoUrl: 'https://www.youtube.com/watch?v=UmnCZ7-9yDY'
    },
    {
      title: 'Python',
      description: 'Master in python programming language.',
      imageUrl: 'https://upload.wikimedia.org/wikipedia/commons/c/c3/Python-logo-notext.svg',
      videoUrl: 'https://www.youtube.com/watch?v=vLqTf2b6GZw'
    },
    {
      title: 'AWS',
      description: 'Master the fundamentals of JavaScript programming language.',
      imageUrl: 'https://upload.wikimedia.org/wikipedia/commons/9/93/Amazon_Web_Services_Logo.svg',
      videoUrl: 'https://www.youtube.com/watch?v=BSGcQi2WNPg'
    },
    {
      title: 'React JS',
      description: 'Master the fundamentals of JavaScript programming language.',
      imageUrl: 'https://upload.wikimedia.org/wikipedia/commons/a/a7/React-icon.svg',
      videoUrl: 'https://www.youtube.com/watch?v=gY5sGvq-8h8'
    }


    
  ];

  constructor() {}

  openVideo(videoUrl: string) {
    window.open(videoUrl, '_blank');
  }
}