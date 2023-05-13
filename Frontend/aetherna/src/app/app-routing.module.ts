import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CriarCursoComponent } from './componentes/cursos/criar-curso/criar-curso.component';
import { ListarCursoComponent } from './componentes/cursos/listar-curso/listar-curso.component';
import { ExcluirCursoComponent } from './componentes/cursos/excluir-curso/excluir-curso.component';
import { EditarCursoComponent } from './componentes/cursos/editar-curso/editar-curso.component';

const routes: Routes = [
  {
    path: '',
    redirectTo: 'listarCurso',
    pathMatch: 'full'
  },
  {
    path: 'criarCurso',
    component: CriarCursoComponent
  },
  {
    path: 'listarCurso',
    component: ListarCursoComponent
  },
  {
    path: 'cursos/excluirCurso/:id',
    component: ExcluirCursoComponent
  },
  {
    path: 'cursos/editarCurso/:id',
    component: EditarCursoComponent
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
