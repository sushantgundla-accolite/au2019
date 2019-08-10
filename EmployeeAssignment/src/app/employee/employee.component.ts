import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { EmployeedataService } from '../employeedata.service';


@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css'],
})
export class EmployeeComponent implements OnInit {

  public EmployeeData: any;

  constructor(private router: Router, private employeedataservice: EmployeedataService,
    private route: ActivatedRoute) { }

  ngOnInit() {
    //subscribe to the employeelist 
    this.employeedataservice.EmployeeDataObservable.subscribe(recievedVal => {
      this.EmployeeData = recievedVal;
    });

  }

  deleteEmployeeFromList(employee: any) {
    // remove element from list and return the list
    var result = this.EmployeeData.filter(function (ele) {
      return ele != employee;
    })

    // update and broadcast the upadted employeelist
    this.employeedataservice.sendEmployeeList(result);
  }

  goToDetails(currEmployee: any) {

    if (this.router.url === '/employees') {
      // go to employee-details component if clicking employeeId when on employees route
      this.router.navigate(['/employee', currEmployee.userId]);
    }
    else {
      // go to todo on clicking employeeId when not on todo route
      this.router.navigate(['/todo', currEmployee.userId]);
    }
  }

}
