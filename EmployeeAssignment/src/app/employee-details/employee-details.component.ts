import { Component, OnInit, Input } from '@angular/core';
import { ActivatedRoute, ParamMap, Router } from '@angular/router';
import { EmployeedataService } from '../employeedata.service';

@Component({
  selector: 'app-employee-details',
  templateUrl: './employee-details.component.html',
  styleUrls: ['./employee-details.component.css']
})
export class EmployeeDetailsComponent implements OnInit {

  public recievedEmployee: any;
  public recievedEmployeeId: number;

  constructor(private route: ActivatedRoute,
    private router: Router,
    private employeedataservice: EmployeedataService) {
  }

  ngOnInit() {

    
    this.route.params.subscribe(value => {
      // get userId from path params
      this.recievedEmployeeId = +value.userId;
      // get employee details from service
      this.recievedEmployee = this.employeedataservice.getEmployeeDetailsFromId(this.recievedEmployeeId);

    });

  }
}
