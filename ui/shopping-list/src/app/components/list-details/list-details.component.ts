import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { GroceryListService } from 'src/app/services/grocery-list-service.service';
import { GroceryList } from 'src/app/models/grocery-list';

@Component({
  selector: 'app-list-details',
  templateUrl: './list-details.component.html',
  styleUrls: ['./list-details.component.css']
})
export class ListDetailsComponent implements OnInit {
  id: number;
  private sub: any;
  private currentList: GroceryList;

  constructor(private route: ActivatedRoute, private groceryListService: GroceryListService) { }

  ngOnInit() {
    this.sub = this.route.params.subscribe(params => {
      this.id = +params['id']; 

      // this.groceryListService.getById(this.id).subscribe(result => {
      //   this.currentList = result;
      // });
      if(this.id===1)
        this.currentList = new GroceryList('Tucker', ['apple','banana','citrus']);
      if(this.id===2)
        this.currentList = new GroceryList('Rodel', ['water', 'ube']);
      
    });
  }

  

}
