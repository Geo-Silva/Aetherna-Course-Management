import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CabecalhoComponent } from './componentes/cabecalho/cabecalho.component';
import { RodapeComponent } from './componentes/rodape/rodape.component';
import { CriarCursoComponent } from './componentes/cursos/criar-curso/criar-curso.component';
import { FormsModule } from '@angular/forms';
import { ListarCursoComponent } from './componentes/cursos/listar-curso/listar-curso.component';
import { CursoComponent } from './componentes/cursos/curso/curso.component';
import { HttpClientModule } from '@angular/common/http';
import { ExcluirCursoComponent } from './componentes/cursos/excluir-curso/excluir-curso.component';
import { EditarCursoComponent } from './componentes/cursos/editar-curso/editar-curso.component';

@NgModule({
  declarations: [
    AppComponent,
    CabecalhoComponent,
    RodapeComponent,
    CriarCursoComponent,
    ListarCursoComponent,
    CursoComponent,
    ExcluirCursoComponent,
    EditarCursoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
