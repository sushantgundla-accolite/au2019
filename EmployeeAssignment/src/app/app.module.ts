import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmployeeComponent } from './employee/employee.component';
import { DepartmentComponent } from './department/department.component';
import { EmployeeDetailsComponent } from './employee-details/employee-details.component';
import { TodoComponent } from './todo/todo.component';
import { DepartmentdetailsComponent } from './departmentdetails/departmentdetails.component';
import { EmployeedataService } from './employeedata.service';

@NgModule({
  declarations: [
    AppComponent,
    EmployeeComponent,
    DepartmentComponent,
    EmployeeDetailsComponent,
    TodoComponent,
    DepartmentdetailsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
  ],
  providers: [EmployeedataService],
  bootstrap: [AppComponent]
})
export class AppModule { }
