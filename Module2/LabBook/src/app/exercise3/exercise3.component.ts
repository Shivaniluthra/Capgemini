import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, FormBuilder, FormArray } from '@angular/forms';
import { element } from 'protractor';

@Component({
  selector: 'app-exercise3',
  templateUrl: './exercise3.component.html',
  styleUrls: ['./exercise3.component.css']
})
export class Exercise3Component implements OnInit {
  product: FormGroup;
  category: Array<string>=['Grocery','Mobile','Electronics','Clothes'];
  stores: Array<string>=['Big Bazaar','DMart','Reliance','Mega store'];
  selectedStores: Array<string>=[];
  selectedCat: Array<string>=[];

  constructor(private fb: FormBuilder) { }
  
  ngOnInit(): void {
    this.product = this.fb.group({
      prodId: new FormControl('',Validators.required),
      prodName: new FormControl('', Validators.required),
      prodCost: new FormControl('', Validators.required),
      prodOn: new FormControl('', Validators.required),
      prodCat: this.addCategoryControl(),
      avail: this.addStoresCOntrol()
    });
  }
  
  addCategoryControl(){
    const arra= this.category.map(element=>{
      return this.fb.control(false);
    });
    return this.fb.array(arra);
  }
  addStoresCOntrol(){
    const arr= this.stores.map(element=>{
      return this.fb.control(false);
    });
    return this.fb.array(arr);
  }

  submit(){
    console.log(this.product.get('prodId').value);
    console.log(this.product.get('prodName').value);
    console.log(this.product.get('prodCost').value);
    console.log(this.product.get('prodOn').value);
    console.log(this.selectedCat);
    console.log(this.selectedStores);
  }
  get prodID(){
    return this.product.get('prodId');
  }
  get prodNam(){
    return this.product.get('prodName');
  }
  get prodCo(){
    return this.product.get('prodCost');
  }
  get prodOnl(){
    return this.product.get('prodOn');
  }
  get prodCate(){
    return <FormArray>this.product.get('prodCat');
  }
  get storesArray(){
    return <FormArray>this.product.get('avail');
  }
  getSelectedStores(){
    this.selectedStores=[];
    this.storesArray.controls.forEach((control,i)=>{
      if(control.value){
        this.selectedStores.push(this.stores[i]);
      }
    });
  }
  getSelectedCategory(){
    this.selectedCat=[];
    this.prodCate.controls.forEach((control,i)=>{
      if(control.value){
        this.selectedCat.push(this.category[i]);
      }
    });
  }
  

}
