import  {Experience} from './Experience';
import  {Principi} from './Principi';
import  {Imagen} from './Imagen';
import  {Feedback} from './Feedback';

export class FeedbackPrincipiExperience{
    
    idexperience: number;
    idprincipi: number;
    nome_principioITA: String;
    nome_principioING: String; 
    secondario: Principi[];
    imagen: Imagen;

    // tslint:disable-next-line:max-line-length
    constructor(  idexperience: number, idprincipi: number, nome_principioITA: String,nome_principioING: String, secondario: Principi[], imagen: Imagen)
    {
        this.idexperience = idexperience;
        this.idprincipi= idprincipi;
        this.nome_principioITA = nome_principioITA;
        this.nome_principioING = nome_principioING;
        this.secondario= secondario;
        this.imagen= imagen;
        
       
        
    }

}