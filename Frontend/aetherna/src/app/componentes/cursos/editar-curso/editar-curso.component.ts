import { Component, OnInit } from '@angular/core';
import { Curso } from '../curso';
import { CursoService } from '../curso.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-editar-curso',
  templateUrl: './editar-curso.component.html',
  styleUrls: ['./editar-curso.component.css']
})
export class EditarCursoComponent implements OnInit {

  curso: Curso = {
    id: 0,
    nome: '',
    descricao: '',
    modelo: ''
  }

  constructor(
    private service: CursoService,
    private router: Router,
    private route: ActivatedRoute
    ) { }

  ngOnInit(): void {
    const id = this.route.snapshot.paramMap.get('id')
    this.service.buscarPorId(parseInt(id!)).subscribe((curso) => {
      this.curso = curso
    })
  }

  editarCurso() {
    this.service.editar(this.curso).subscribe(() => {
      this.router.navigate(['/listarCurso'])
    })
  }

  cancel() {
    this.router.navigate(['/listarCurso'])
  }

}
