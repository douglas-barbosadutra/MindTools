import  {Principi} from './Principi';
import  {Imagen} from './Imagen';
import { Experience } from './Experience';

export class ExperienceUserFeedbackDTO {
	commento: string;
    nome: string;
    cognome: string;
    score: number;
	principi: Principi;
	experience: Experience;
	imagen: Imagen;
	
    constructor( commento: string, nome: string, cognome: string, score: number, principi: Principi, experience: Experience, imagen: Imagen) {
        this.commento = commento;    
        this.nome = nome;    
        this.cognome = cognome;
        this.score = score;    
        this.principi = principi;    
        this.experience = experience;    
        this.imagen = imagen;    
    }	
}