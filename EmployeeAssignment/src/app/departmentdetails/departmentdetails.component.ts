import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { EmployeedataService } from '../employeedata.service';

@Component({
  selector: 'app-departmentdetails',
  templateUrl: './departmentdetails.component.html',
  styleUrls: ['./departmentdetails.component.css']
})
export class DepartmentdetailsComponent implements OnInit {

  public recievedDepartment: any;
  public recievedDepartmentId: number;

  constructor(private route: ActivatedRoute,
    private employeedataservice: EmployeedataService) { }

  ngOnInit() {

    // get the deptartmentId from path parameters
    this.route.params.subscribe(value => {

      this.recievedDepartmentId = +value.departmentId;
      this.recievedDepartment = this.employeedataservice.getDepartmentDetailsFromId(this.recievedDepartmentId);

    });

  }

}
