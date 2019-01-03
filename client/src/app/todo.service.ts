import {Injectable} from '@angular/core';
import {Todo} from './todo';
import {HttpClient} from '@angular/common/http';
import {catchError} from 'rxjs/operators';
import {Observable, of} from 'rxjs';

@Injectable()
export class TodoService {
  private baseUrl = 'http://localhost:8080';

  constructor(private http: HttpClient) {
  }

  getTodos(): Observable<Todo[]> {
    return this.http.get<Todo[]>(this.baseUrl + '/api/todos/')
      .pipe(
        catchError(this.handleError<Todo[]>('getTodos() '))
      )
  }

  createTodo(todoData: Todo): Observable<Todo> {
    return this.http.post<Todo>(this.baseUrl + '/api/todos/', todoData)
      .pipe(
        catchError(this.handleError<Todo>(`createTodo ${todoData.title}`))
      )
  }

  updateTodo(todoData: Todo): Observable<Todo> {
    return this.http.put<Todo>(this.baseUrl + '/api/todos/' + todoData.id, todoData)
      .pipe(
        catchError(this.handleError<Todo>(`updateTodo ${todoData.title}`))
      )
  }

  deleteTodo(id: string): Observable<any> {
    return this.http.delete(this.baseUrl + '/api/todos/' + id)
      .pipe(
        catchError(this.handleError<Todo>(`deleteTodo id=${id}`))
      )
  }

  private handleError<T>(operation = 'operation', result?: T) {
    console.error(operation)
    return (error: any): Observable<T> => {
      return of(result as T);
    };
  }
}
