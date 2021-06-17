import { Component, OnInit } from '@angular/core';
import { DatePipe } from '@angular/common'

@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrls: ['./about.component.css']
})
export class AboutComponent implements OnInit {

  date: Date;

  constructor(public datepipe: DatePipe) { 
    this.date=new Date(Date.now());
    let latest_date =this.datepipe.transform(this.date, 'yyyy-MM-dd');
  }

  ngOnInit(): void {
  }
}
