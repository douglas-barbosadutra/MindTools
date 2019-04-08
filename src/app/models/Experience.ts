import  {Feedback} from './Feedback';
import  {User} from './User';
import  {Imagen} from './Imagen';

export class Experience {
    idExperience: number;
    user: User;
    idPrincipi: number;
    commento: string;
    positivo: string;
    negativo: string;
    score: number;
    feedback: Array<number>;
    
    

    // tslint:disable-next-line:max-line-length
    constructor(user: User, idPrincipi: number, commento: string, positivo: string, negativo: string,  score: number, feedback: Array<number>) {
        this.idPrincipi =  idPrincipi;
        this.user = user;
        this.commento = commento;
        this.positivo =positivo;
        this.negativo = negativo;
        this.score = score;
        this.feedback =  feedback;
        
    }

}