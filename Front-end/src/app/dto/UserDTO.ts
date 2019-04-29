export class UserDTO
{
    idUser: number;
    username: String;
    password: String;
    nome: String;
    cognome: String;
    email: String;
    lingua: String;
    rank: number;

    constructor(idUser: number, username: String, password: String, nome: String, cognome: String, email: String, lingua: String, rank: number)
    {
        this.idUser = idUser;
        this.username = username;
        this.password = password;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.lingua = lingua;
        this.rank = rank;

    }

}