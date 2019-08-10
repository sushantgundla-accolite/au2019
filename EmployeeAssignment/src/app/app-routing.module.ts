import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { EmployeeComponent } from './employee/employee.component';
import { DepartmentComponent } from './department/department.component';
import { EmployeeDetailsComponent } from './employee-details/employee-details.component';
import { TodoComponent } from './todo/todo.component';
import { DepartmentdetailsComponent } from './departmentdetails/departmentdetails.component';

const routes: Routes = [{path:"employees",component:EmployeeComponent},
                        {path:"employee/:userId",component:EmployeeDetailsComponent},
                        {path:"departments",component:DepartmentComponent},
                        {path:"department/:departmentId",component:DepartmentdetailsComponent},
                        {path:"todo",component:TodoComponent},
                        {path:"todo/:userId",component:TodoComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
