import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './components/about/about.component';
import { ContactusComponent } from './components/contactus/contactus.component';
import { HomeComponent } from './components/home/home.component';
import { StudentRegistrationComponent } from './components/student-registration/student-registration.component';
import { UserformComponent } from './components/userform/userform.component';

const routes: Routes = [{path:"home", component:HomeComponent}, {path:"register", component:UserformComponent}
,{path:"ContactusComponent", component:ContactusComponent}, {path:"About", component:AboutComponent}, 
{path:"StudentRegistration", component:StudentRegistrationComponent} ];



@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
