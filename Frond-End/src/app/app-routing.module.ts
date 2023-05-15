import { RouterModule, Routes } from "@angular/router";
import { HomeComponent } from "./components/home/home.component";
import { LoginComponent } from "./components/login/login.component";
import { NgModule } from "@angular/core";
import { AcercaDeComponent } from "./components/acerca-de/acerca-de.component";

const routes:Routes = [
    {path: '', component: HomeComponent},
    {path:'login', component: LoginComponent},
    {path:'acercademi', component:AcercaDeComponent}
]

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule{}