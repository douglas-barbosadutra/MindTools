import { User } from '../models/User';

export class ExperienceDTOAggiornato{
    user: User; 
    idPrincipi: number;
    commento: string; 
    score: number;
    archivo: ByteLengthChunk[];


    constructor(user: User, idPrincipi: number, commento: string, score: number, archivo: ByteLengthChunk[]){
            this.commento = commento;
            this.idPrincipi = idPrincipi;
            this.user = user;
            this.score = score;
            this.archivo=archivo;
        }
}