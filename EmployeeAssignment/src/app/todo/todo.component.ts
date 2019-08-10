import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { EmployeedataService } from '../employeedata.service';

@Component({
  selector: 'app-todo',
  templateUrl: './todo.component.html',
  styleUrls: ['./todo.component.css'],
})
export class TodoComponent implements OnInit {

  constructor(private employeedataservice: EmployeedataService) {
  }

  ngOnInit() {
  }
}
