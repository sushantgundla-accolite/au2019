import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';
import * as empdata from './employee/employee.json'
import * as deptdata from './department/department.json'


@Injectable({
  providedIn: 'root',
})
export class EmployeedataService {

  // employee list and observable
  private employeelist = empdata.default;
  private EmployeeList = new BehaviorSubject(this.employeelist);
  EmployeeDataObservable = this.EmployeeList.asObservable();

  // department list and observable
  private departmentlist = deptdata.default;
  private DepartmentList = new BehaviorSubject(this.departmentlist);
  DepartmentDataObservable = this.DepartmentList.asObservable();

  // constructor() { }

  // get the employee details using the userId
  getEmployeeDetailsFromId(recieveduserId:number){
    let employee = this.employeelist.find(function(element) {
      return element.userId == recieveduserId;
    }); 
    return employee;
  }

  // update the employee list
  sendEmployeeList(value: any) {
    this.EmployeeList.next(value);
  }


  // uodate the department list
  sendDepartmentList(value: any) {
    this.DepartmentList.next(value);
  }

  // get the department details using the departmentId
  getDepartmentDetailsFromId(recievedDeptId:number){
    let department = this.departmentlist.find(function(element) {
      return element.departmentId == recievedDeptId;
    }); 
    return department;
  }


}
