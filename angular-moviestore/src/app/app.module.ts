import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { LanguageListsComponent } from './components/language-lists/language-lists.component';
import { LanguageService } from './services/language.service';

@NgModule({
  declarations: [
    AppComponent,
    LanguageListsComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [
    LanguageService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
