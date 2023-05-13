import { Component, Input, OnInit } from '@angular/core';
import { Curso } from '../curso';

@Component({
  selector: 'app-curso',
  templateUrl: './curso.component.html',
  styleUrls: ['./curso.component.css']
})
export class CursoComponent implements OnInit{

  @Input() curso: Curso = {
    id: 0,
    nome: 'Desenvolvimento Python',
    descricao: 'Do zero ao mestre em Python',
    modelo: 'modelo1'
  }

  constructor() {

  }

  ngOnInit(): void {

  }

  larguraCurso() : string {

    if(this.curso.nome.length >=30) {
      return 'curso-g'
    }
    return 'curso-p'

  }

}
