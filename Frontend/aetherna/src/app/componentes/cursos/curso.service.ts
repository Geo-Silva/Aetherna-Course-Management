import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Curso } from './curso';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CursoService {

  private api = 'http://localhost:8080/cursos'

  constructor(private http: HttpClient) { }

  listar(): Observable<Curso[]> {
    return this.http.get<Curso[]>(this.api)
  }

  criar(curso : Curso) : Observable<Curso> {
    return this.http.post<Curso>(`${this.api}/criar`, curso)
  }

  editar(curso: Curso) : Observable<Curso> {
    const url = `${this.api}/atualizar/${curso.id}`
    return this.http.put<Curso>(url, curso)
  }

  excluir(id: number) : Observable<Curso> {
    const url = `${this.api}/deletar/${id}`
    return this.http.delete<Curso>(url)
  }

  buscarPorId(id: number) : Observable<Curso> {
    const url = `${this.api}/buscar/${id}`
    return this.http.get<Curso>(url)
  }

}
