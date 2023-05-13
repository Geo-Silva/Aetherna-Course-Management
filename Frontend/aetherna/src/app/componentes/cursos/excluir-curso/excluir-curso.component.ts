import { Component, OnInit } from '@angular/core';
import { CursoService } from '../curso.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Curso } from '../curso';

@Component({
  selector: 'app-excluir-curso',
  templateUrl: './excluir-curso.component.html',
  styleUrls: ['./excluir-curso.component.css']
})
export class ExcluirCursoComponent implements OnInit {

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
    ){ }

  ngOnInit(): void {
    const id = this.route.snapshot.paramMap.get('id')
    this.service.buscarPorId(parseInt(id!)).subscribe((curso) => {
      this.curso = curso
    })
  }

  excluirCurso() {
    if(this.curso.id) {
      this.service.excluir(this.curso.id).subscribe(() => {
      this.router.navigate(['/listarCurso'])
    })
    }
  }

  cancelar() {
    this.router.navigate(['/listarCurso'])
  }

}
