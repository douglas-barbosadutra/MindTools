import  {Principi} from './Principi';
import  {Imagen} from './Imagen';
import { Experience } from './Experience';

export class ExperienceUserFeedbackDTO {
	nomePrincipio: string;
    nomeUtente: string;
    commentoExperience: string;
    scoreExperience: number;
    
    constructor( nomePrincipio: string, nomeUtente: string, commentoExperience: string, scoreExperience: number) {
        this.nomePrincipio = nomePrincipio;    
        this.nomeUtente = nomeUtente;    
        this.commentoExperience = commentoExperience;  
        this.scoreExperience = scoreExperience;
    }	
}