import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SiuntosListComponent } from './siuntos-list.component';

describe('SiuntosListComponent', () => {
  let component: SiuntosListComponent;
  let fixture: ComponentFixture<SiuntosListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SiuntosListComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SiuntosListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
