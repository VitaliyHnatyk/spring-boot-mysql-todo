import {Component, Output, Input, EventEmitter} from '@angular/core';

@Component({
    template: '<div class="footer"  ><h5>Copyright 2018 The Options Lab {{version}}</h5></div>',
    selector: 'footer',
    styleUrls: ['./footer.component.css']
})

export class FooterComponent {
  @Input() version: number;
}


