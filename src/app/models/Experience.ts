import  {Feedback} from './Feedback';
import  {User} from './User';
import  {Imagen} from './Imagen';

export class Experience {
    idExperience: number;
    user: User[];
    commento: string;
    positivo: string;
    negativo: string;
    score: number;
    feedback: Feedback[];
    imagen: Imagen[];
    

    // tslint:disable-next-line:max-line-length
    constructor( idExperience: number, user: User[],commento: string, positivo: string, negativo: string,  score: number, feedback: Feedback[],   imagen: Imagen[]) {
        this.idExperience = idExperience;    
        this.user = user;
        this.commento = commento;
        this.positivo =positivo;
        this.negativo = negativo;
        this.score = score;
        this.feedback =  feedback;
        this.imagen = imagen;
    }

}