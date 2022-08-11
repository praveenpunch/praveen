import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { HttpClient } from "@angular/common/http";
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class CrudService {
  serviceApiUrl: string = environment.serviceApiUrl;
 
  constructor(public http: HttpClient) { }

  fetchAllEmployeeDetails() {
    return this.http.get<Observable<any>>(this.serviceApiUrl + "employee_id/all");
  }
  fetchAllEmployeeById(employeeId: any) {
    
    return this.http.post<Observable<any>>(this.serviceApiUrl + "employee_id/fetchByEmpId",employeeId);
  }
}
