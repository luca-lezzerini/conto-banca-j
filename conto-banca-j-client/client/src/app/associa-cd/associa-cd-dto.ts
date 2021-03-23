import { ContoDeposito } from "../gestione-cd/contoDeposito";
import { Cliente } from "../gestione-cliente/cliente";

export class associaCDDto {
    cliente: Cliente;
    conto: ContoDeposito;
}