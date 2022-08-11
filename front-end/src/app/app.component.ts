import { Component } from '@angular/core';
import { CrudService } from './crud.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  public dataList : any;
  public empDetailsId:any;
  public employeeId:any
  constructor(private crudService: CrudService) { }
  title = 'employee-details';

  search(){
  //   this.crudService.fetchAllEmployeeDetails().subscribe(x => {
  //     this.dataList = []
  //     this.dataList = x
  // })
  console.log('empid',this.employeeId)
  this.crudService.fetchAllEmployeeById(this.employeeId).subscribe(x => {
    this.empDetailsId = []
    this.empDetailsId = x
})
  }
}
