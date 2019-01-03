import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';

import {FormsModule} from '@angular/forms';
import { HttpClientModule }    from '@angular/common/http';

import {AppComponent} from './app.component';
import {TodoListComponent} from './todo-list.component';
import {TodoService} from './todo.service';
import {FooterComponent} from './footer.component';


@NgModule({
  declarations: [
    AppComponent,
    FooterComponent,
    TodoListComponent
  ],

  imports: [
    BrowserAnimationsModule,
    BrowserModule,
    FormsModule,
    HttpClientModule,
  ],

  exports: [
    BrowserAnimationsModule,
    BrowserModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [TodoService],
  bootstrap: [AppComponent]
})

export class AppModule {}
