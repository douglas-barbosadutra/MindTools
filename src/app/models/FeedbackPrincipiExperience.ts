import  {Experience} from './Experience';
import  {Principi} from './Principi';
import  {Imagen} from './Imagen';
import  {Feedback} from './Feedback';

export class FeedbackPrincipiExperience{
    
    id_experience: number;
    id_principi: number;
    nome_principioITA: String;
    nome_principioING: String; 
    secondario: Principi[];
    imagen: Imagen;

    // tslint:disable-next-line:max-line-length
    constructor(  id_experience: number, id_principi: number, nome_principioITA: String,nome_principioING: String, secondario: Principi[], imagen: Imagen)
    {
        this.id_experience = id_experience;
        this.id_principi= id_principi;
        this.nome_principioITA = nome_principioITA;
        this.nome_principioING = nome_principioING;
        this.secondario= secondario;
        this.imagen= imagen;
        
       
        
    }

}