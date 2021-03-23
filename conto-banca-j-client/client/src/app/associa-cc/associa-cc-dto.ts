import { ContoCorrente } from '../gestione-cc/contoCorrente';
import { Cliente } from '../gestione-cliente/cliente';

export class AssociaCCDto {
  cliente: Cliente;
  contoCorrente: ContoCorrente;
}
