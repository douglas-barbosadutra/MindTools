import  {Experience} from './Experience';

export class User {
    idUser: number;
    username: string;
    password: string;
    nome: string;
    cognome: string;
    email: string;
    lingua:string;
    experience: Experience[];


    // tslint:disable-next-line:max-line-length
    constructor( idUser: number, username: string, password: string, nome:  string, cognome: string,  email: string, lingua:string,  experience: Experience[]) {
        this.idUser = idUser;
        this.username = username;
        this.password = password;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.lingua = lingua;
        this.experience = experience;
    }

}