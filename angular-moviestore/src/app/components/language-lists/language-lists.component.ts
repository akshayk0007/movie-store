import { Component, OnInit } from '@angular/core';
import { Language } from 'src/app/common/language';
import { LanguageService } from 'src/app/services/language.service';

@Component({
  selector: 'app-language-lists',
  templateUrl: './language-lists.component.html',
  styleUrls: ['./language-lists.component.css']
})
export class LanguageListsComponent implements OnInit {

  languages: Language[];

  constructor(private _languageService: LanguageService) { }

  ngOnInit(): void {
    this.listLanguages();
  }

  listLanguages() {
    this._languageService.getLanguages().subscribe(
      data => this.languages = data
    )
  }

}
