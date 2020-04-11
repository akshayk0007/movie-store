import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { Language } from '../common/language';

@Injectable({
  providedIn: 'root'
})
export class LanguageService {

  private baseUrl = "http://localhost:8080/api/v1/languages";

  constructor(private httpClient: HttpClient) { }

  getLanguages(): Observable<Language[]> {
    return this.httpClient.get<GetResponseLanguages>(this.baseUrl).pipe(
      map(response => response._embedded.languages)
    );
  }
}

interface GetResponseLanguages {
  _embedded: {
    languages: Language[];
  }
}
