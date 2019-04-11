import  {Principi} from './Principi';
import  {Imagen} from './Imagen';
import { Experience } from './Experience';

export class ExperienceUserFeedbackDTO {
	nomePrincipio: string;
    nomeUtente: string;
    commentoExperience: string;
    scoreExperience: number;
    archivo: ByteLengthChunk[];

    constructor( nomePrincipio: string, nomeUtente: string, commentoExperience: string, scoreExperience: number, archivo: ByteLengthChunk[]
        ) {
        this.nomePrincipio = nomePrincipio;    
        this.nomeUtente = nomeUtente;    
        this.commentoExperience = commentoExperience;  
        this.scoreExperience = scoreExperience;
        this.archivo=archivo;
    }	
}