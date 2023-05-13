import { Component, OnInit } from '@angular/core';
import { Curso } from '../curso';
import { CursoService } from '../curso.service';

@Component({
  selector: 'app-listar-curso',
  templateUrl: './listar-curso.component.html',
  styleUrls: ['./listar-curso.component.css']
})
export class ListarCursoComponent implements OnInit {

  listaCursos : Curso[] = [

  ]

  constructor(private service : CursoService) {

  }

  ngOnInit(): void {
    this.service.listar().subscribe((listaCursos) => {
      this.listaCursos = listaCursos
    })
  }
}
