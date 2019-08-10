import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { EmployeedataService } from '../employeedata.service.js';

@Component({
  selector: 'app-department',
  templateUrl: './department.component.html',
  styleUrls: ['./department.component.css']
})
export class DepartmentComponent implements OnInit {

  constructor(private employeedataservice: EmployeedataService, private router: Router) { }

  public DepartmentData: any;

  ngOnInit() {

    // get department details from service
    this.employeedataservice.DepartmentDataObservable.subscribe(recievedVal => {
      this.DepartmentData = recievedVal;
    });

  }

  // fucntion to go to department details
  goToDetails(currDept: any) {
    this.router.navigate(['/department', currDept.departmentId]);
  }

}
