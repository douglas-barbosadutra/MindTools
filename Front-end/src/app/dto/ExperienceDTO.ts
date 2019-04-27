import { User } from '../models/User';

export class ExperienceDTO{
    idPrincipi: number;
    commento: string; 
    positivo: string; 
    negativo: string;
    score: number;
    secon: Array<string>;
    


    constructor( idPrincipi: number, commento: string, positivo: string, negativo: string, score: number,
        secon: Array<string>){
            this.commento = commento;
            this.idPrincipi = idPrincipi;
            this.negativo = negativo;
            this.positivo = positivo;
            this.score = score;
            this.secon = secon;
           
        }
}