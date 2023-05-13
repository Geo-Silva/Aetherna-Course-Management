import { Component, OnInit } from '@angular/core';
import { Curso } from '../curso';
import { CursoService } from '../curso.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-criar-curso',
  templateUrl: './criar-curso.component.html',
  styleUrls: ['./criar-curso.component.css']
})
export class CriarCursoComponent implements OnInit {

  curso: Curso = {

    nome: '',
    descricao: '',
    modelo: 'modelo1'
  }

  constructor(
    private service: CursoService,
    private router: Router
    ) { }

  ngOnInit(): void {

  }

  criarCurso() {
    this.service.criar(this.curso).subscribe(() => {
      this.router.navigate(['/listarCurso'])
    })
  }

  cancel() {

    this.router.navigate(['/listarCurso'])

  }

}
