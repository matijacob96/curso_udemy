import { Component, OnInit, Input, OnChanges, SimpleChanges } from "@angular/core";

@Component({
  selector: "paginator-nav",
  templateUrl: "./paginator.component.html"
})
export class PaginatorComponent implements OnInit, OnChanges {
  @Input() paginador: any;
  pages: number[];

  from: number;
  until: number;

  constructor() {}

  ngOnInit() {
    this.initPaginator();
  }

  ngOnChanges(changes: SimpleChanges){
    let paginadoractualizado = changes['paginador'];

    if(paginadoractualizado.previousValue){
      this.initPaginator();
    }
  }

  private initPaginator():void {
    this.from = Math.min(
      Math.max(1, this.paginador.number - 4),
      this.paginador.totalPages - 5
    );
    this.until = Math.max(
      Math.min(this.paginador.totalPages, this.paginador.number + 4),
      6
    );

    if (this.paginador.totalPages > 5) {
      this.pages = new Array(this.until - this.from + 1)
        .fill(0)
        .map((value, index) => index + this.from);
    } else {
      this.pages = new Array(this.paginador.totalPages)
        .fill(0)
        .map((value, index) => index + 1);
    }
  }
}
