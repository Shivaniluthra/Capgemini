import { Component} from '@angular/core';
import {Employee} from './Employee.model'

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'LabBook';
  isAdded: boolean= false;
  isUpdated: boolean= false;
  isDeleted: boolean= false;
  updateTable: boolean= false;
  empId: number;
  empName: string;
  empSal: number;
  empDep: string;
  index: number;

  emp: Employee[]=[
    (new Employee(1001,'Rahul',9000,"Java")),
    (new Employee(1002,'Sachin',19000,'OraApps')),
    (new Employee(1003,'Vikash',29000,'BI'))
  ];

  setData(id:HTMLInputElement, name:HTMLInputElement, salary:HTMLInputElement, department:HTMLInputElement){
    this.emp.push (new Employee(parseInt(id.value), name.value, parseInt(salary.value), department.value));
    this.isAdded= true;
  }
  upTab( e, empId: number, empName: string, empSal: number, empDep: string){
    this.index= e;
    this.updateTable= true;
    this.empId= empId;
    this.empName= empName;
    this.empSal= empSal;
    this.empDep= empDep;
  }
  upTable( id:HTMLInputElement, name:HTMLInputElement, salary:HTMLInputElement, department:HTMLInputElement){
    this.emp.splice(this.index,1,new Employee(parseInt(id.value), name.value, parseInt(salary.value), department.value));
    this.isUpdated= true;
  }
  delTable(i){
    this.emp.splice(i,1);
    this.isDeleted= true;
  }
  
}


