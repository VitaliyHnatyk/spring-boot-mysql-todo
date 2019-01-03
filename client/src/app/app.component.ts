import { Component } from '@angular/core';
import { FooterComponent } from './footer.component';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';
  private chart;



  myCount: number = 0;
  version = 1;

  countChange(event) {
    this.myCount = event;
    console.log( "set new version" );
    this.version = this.myCount;

  }
}
