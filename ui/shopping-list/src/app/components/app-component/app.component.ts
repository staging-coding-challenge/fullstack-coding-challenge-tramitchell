import { Component } from '@angular/core';
import { GroceryListService } from '../../services/grocery-list-service.service';
import { GroceryList } from '../../models/grocery-list';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'shopping-list';

  private groceryLists: GroceryList[];
  
  constructor(private groceryListService: GroceryListService, private router: Router) {}
 

  ngOnInit() {
    // this.groceryListService.getAll().subscribe( (result) => {
    //   this.groceryLists = result;
    // });

    this.groceryLists = [
      {id: 1, name:'Tucker\'s list', contents:['apple', 'banana', 'cheese']}, 
      {id: 2, name:'Rodel\'s List', contents: ['burrito']}
    ];
    
  }

  navigate(id: number) {
    this.router.navigate(['/list-details/' + id]);
  }
}
