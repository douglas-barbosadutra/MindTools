export class ExperienceDTO{
    idUser: number; 
    idPrincipi: number;
    commento: string; 
    positivo: string; 
    negativo: string;
    score: number;
    secon: Array<string>;

    constructor(idUser: number, idPrincipi: number, commento: string, positivo: string, negativo: string, score: number,
        secon: Array<string>){
            this.commento = commento;
            this.idPrincipi = idPrincipi;
            this.idUser = idUser;
            this.negativo = negativo;
            this.positivo = positivo;
            this.score = score;
            this.secon = secon;
        }
}