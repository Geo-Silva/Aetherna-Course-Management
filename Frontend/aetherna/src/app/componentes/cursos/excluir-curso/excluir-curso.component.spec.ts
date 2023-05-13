import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ExcluirCursoComponent } from './excluir-curso.component';

describe('ExcluirCursoComponent', () => {
  let component: ExcluirCursoComponent;
  let fixture: ComponentFixture<ExcluirCursoComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ExcluirCursoComponent]
    });
    fixture = TestBed.createComponent(ExcluirCursoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
